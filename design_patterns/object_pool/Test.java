package object_pool;

public class Test {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getDbConnectionPoolManagerInstance();

        DBConnection dbConnection1 = dbConnectionPoolManager.getDbConnection();
        DBConnection dbConnection2 = dbConnectionPoolManager.getDbConnection();
        DBConnection dbConnection3 = dbConnectionPoolManager.getDbConnection();
        DBConnection dbConnection4 = dbConnectionPoolManager.getDbConnection();
        DBConnection dbConnection5 = dbConnectionPoolManager.getDbConnection();
        DBConnection dbConnection6 = dbConnectionPoolManager.getDbConnection();
        dbConnectionPoolManager.getDbConnection();
        dbConnectionPoolManager.releaseDbConnection(dbConnection6);

    }
}
