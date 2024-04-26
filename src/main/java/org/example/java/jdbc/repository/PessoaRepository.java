package org.example.java.jdbc.repository;
import org.example.java.jdbc.conn.ConectionFactory;
import org.example.java.jdbc.dominio.PessoaBd;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    public static void save(PessoaBd peson)
    {
        String sql = String.format("INSERT INTO pessoa.dados_pessoa (nome,cpf) VALUES ('%s',%s);", peson.getName(),peson.getCpf());

        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement()) {
            stm.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id)
    {
        String sql = String.format("DELETE FROM pessoa.dados_pessoa WHERE  (id = '%d');",id);
        //APAGANDO VARIOS DE UMA VEZ
        String sql2 = String.format("DELETE FROM pessoa.dados_pessoa WHERE id BETWEEN '%d' AND 27;",id);

        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement()) {
            stm.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void update(PessoaBd peson)
    {
        String sql = String.format("UPDATE pessoa.dados_pessoa SET nome = '%s' WHERE (id = '%d');",peson.getName(),peson.getId());

        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement()) {
            stm.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<PessoaBd> select()
    {
        String sql = "SELECT id, cpf FROM pessoa.dados_pessoa;";
        List<PessoaBd> list = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(sql)) {


            while(result.next())
            {
                //pegando os valores do mysql e add nas variaves, depois add na lista
                /*
                //essa e uma forma de pegar tambem
                var id = result.getInt("id");//aqui vc diz qual coluna quer pegar
                var nome = result.getString("name");//ai vc informa a coluna q esta no sql
                 */
                PessoaBd ps = PessoaBd
                        .builder()
                        .id(result.getInt("id"))
                        .cpf(result.getString("cpf"))
                        .build();
                list.add(ps);

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados "+e);
        }
        return list;
    }

    public static List<PessoaBd> searchName(String nome)
    {
        String sql = String.format("SELECT * FROM pessoa.dados_pessoa WHERE nome LIKE '%%%s%%';",nome);
        List<PessoaBd> list = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(sql)) {


            while(result.next())
            {
                //pegando os valores do mysql e add nas variaves, depois add na lista
                /*
                //essa e uma forma de pegar tambem
                var id = result.getInt("id");//aqui vc diz qual coluna quer pegar
                var nome = result.getString("name");//ai vc informa a coluna q esta no sql
                 */
                PessoaBd ps = PessoaBd
                        .builder()
                        .name(result.getString("nome"))
                        .id(result.getInt("id"))
                        .cpf(result.getString("cpf"))
                        .build();
                list.add(ps);

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados "+e);
        }
        return list;
    }

    public static void showPessoaMetaData()
    {
        String sql = "SELECT * FROM pessoa.dados_pessoa;";

        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(sql)) {
            ResultSetMetaData metaData = result.getMetaData();
            for (int i = 1;i<= metaData.getColumnCount();i++) {

                System.out.printf("=========%s==========\n",metaData.getColumnName(i));

                System.out.printf("Nome banco dados: '%s' \n", metaData.getCatalogName(i));
                System.out.printf("nome da tabela: '%s' \n", metaData.getTableName(i));
                System.out.printf("Total de colunas: '%s' \n", metaData.getColumnCount());
                System.out.printf("Nome da coluna: '%s' \n", metaData.getColumnName(i));
                System.out.printf("Nome da coluna: '%s' \n", metaData.getColumnLabel(i));
                System.out.printf("Variavel usada na coluna: '%s' \n", metaData.getColumnTypeName(i));
                System.out.printf("Nome do importe da variavel: '%s' \n", metaData.getColumnClassName(i));
                System.out.printf("Total caracteres aceito: '%s' \n", metaData.getColumnDisplaySize(i));
                System.out.printf("Maximo digitos aceito: '%s' \n", metaData.getPrecision(i));
                System.out.printf("Retorna numeros apos ,: '%s' \n", metaData.getScale(i));
                System.out.printf("Nao sei: '%s' \n", metaData.getSchemaName(i));

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados "+e);
        }
    }

    public static void showDriveMetaData()
    {
        String sql = "SELECT * FROM pessoa.dados_pessoa;";

        try(Connection conn = ConectionFactory.getConnection();) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY))//de cima pra baixo
            {
                System.out.println("Supports: TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE))
                {
                    System.out.println(" And supports: CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE))// cima e baixo, não atualiza em tempo real
            {
                System.out.println("Supports: TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE))
                {
                    System.out.println(" And supports: CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE))// atualiza em tempo real
            {
                System.out.println("Supports: TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE))
                {
                    System.out.println(" And supports: CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados "+e);
        }
    }

    public static void showTypeScrollWorking()
    {//nevegando entre as linhas
        String sql ="SELECT * FROM pessoa.dados_pessoa;";

        try(Connection conn = ConectionFactory.getConnection();
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet result = stm.executeQuery(sql)) {

            //indo pra ultima linha
            System.out.println("Last line: "+result.last());
            System.out.println("Number line: "+result.getRow());
            System.out.println(PessoaBd.builder()
                    .name(result.getString("nome"))
                    .id(result.getInt("id"))
                    .cpf(result.getString("cpf")).build());

            //indo pra primeira linha
            System.out.println("first line: "+result.first());
            System.out.println("Number line: "+result.getRow());
            System.out.println(PessoaBd.builder()
                    .name(result.getString("nome"))
                    .id(result.getInt("id"))
                    .cpf(result.getString("cpf")).build());

            //indo pra uma linha especifica
            System.out.println("Line precise: "+ result.absolute(2));
            System.out.println("Number line: "+result.getRow());
            System.out.println(PessoaBd.builder()
                    .name(result.getString("nome"))
                    .id(result.getInt("id"))
                    .cpf(result.getString("cpf")).build());

            //volta uma linha
            System.out.println("Line relative: "+ result.relative(-1));
            System.out.println("Number line: "+result.getRow());
            System.out.println(PessoaBd.builder()
                    .name(result.getString("nome"))
                    .id(result.getInt("id"))
                    .cpf(result.getString("cpf")).build());




            System.out.println("----------------");
            //dessa forma vc pega todos da list de baixo pra cima
            System.out.println("Last line: "+result.last());
            result.next();
            System.out.println("after last line: "+result.isAfterLast());
            while(result.previous())//começando de baixo pra cima
            {
                System.out.println(PessoaBd.builder()
                        .name(result.getString("nome"))
                        .id(result.getInt("id"))
                        .cpf(result.getString("cpf")).build());
            }



        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados "+e);
        }
    }
}
