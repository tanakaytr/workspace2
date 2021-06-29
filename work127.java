class work127 {
    public static void main (String[] args) {
        DBManager db1 = DBManager.getInstance();
        String connection1 = db1.getConnection();
        show(connection1);
        
        show("==========");
        
        DBManager db2 = DBManager.getInstance();
        String connection2 = db2.getConnection();
        show(connection2);
        
    }
    
    static void show(Object o) {
        System.out.println(o);
    }
}
