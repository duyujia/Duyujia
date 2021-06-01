package com.dyj.static_.interface_;

public class Interface03 {//项目经理
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);

    }
    public static void t(DBIInterface db){
        db.connect();
        db.close();
    }
}

class MysqlDB implements DBIInterface{

    @Override
    public void connect() {
        System.out.println("连接sql");
    }

    @Override
    public void close() {
        System.out.println("关闭sql");
    }
}
class OracleDB implements DBIInterface{
    @Override
    public void connect() {
        System.out.println("连接sql");
    }

    @Override
    public void close() {
        System.out.println("关闭sql");
    }
}
