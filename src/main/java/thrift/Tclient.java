package thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift.gen.Test;


public class Tclient {

    public static void main(String[] args) throws TException {
        TTransport m_transport = new TFramedTransport(new TSocket("localhost",9000, 2000));
        TProtocol protocol = new TBinaryProtocol(m_transport);
        Test.Client testClient = new Test.Client(protocol);
        m_transport.open();
        testClient.login("yj","!23");
        m_transport.close();

    }
}
