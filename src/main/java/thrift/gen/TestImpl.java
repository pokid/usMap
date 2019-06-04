package thrift.gen;

import org.apache.thrift.TException;

public class TestImpl implements Test.Iface {
    @Override
    public boolean login(String userAccount, String password) throws TException {
        System.out.println("hello");
        return true;
    }
}
