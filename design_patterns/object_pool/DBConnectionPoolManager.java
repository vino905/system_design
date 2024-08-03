package object_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DBConnectionPoolManager {
    private List<DBConnection> freeeConnectionInPool = new ArrayList<>();
    private List<DBConnection> connectionInUse = new ArrayList<>();
    private static final int INITIAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 6;
    private static DBConnectionPoolManager dbConnectionPoolManager = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeeConnectionInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getDbConnectionPoolManagerInstance() {
        if (dbConnectionPoolManager == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized DBConnection getDbConnection() {
        if (freeeConnectionInPool.isEmpty() && connectionInUse.size() < MAX_POOL_SIZE) {
            freeeConnectionInPool.add(new DBConnection());
        } else if (freeeConnectionInPool.isEmpty() && connectionInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("max pool size limit reache !");
            return null;
        }
        DBConnection connection = freeeConnectionInPool.remove(freeeConnectionInPool.size() - 1);
        connectionInUse.add(connection);
        return connection;
    }

    public synchronized void releaseDbConnection(DBConnection connection) {
        if (!Objects.isNull(connection)) {
            connectionInUse.remove(connection);
            freeeConnectionInPool.add(connection);
        }
    }
}
