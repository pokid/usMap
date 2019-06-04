package thrift;


import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.*;
import thrift.gen.Test;
import thrift.gen.TestImpl;

public class Tserver  {

    public static void main(String[] args) throws TTransportException {
        TProcessor tProcessor = new Test.Processor<Test.Iface>(new TestImpl());
        TNonblockingServerSocket nioSocket = new TNonblockingServerSocket(9000);
        TNonblockingServer.Args tnbArgs = new TNonblockingServer.Args(nioSocket);
        tnbArgs.processor(tProcessor);
        tnbArgs.transportFactory(new TFramedTransport.Factory());
        tnbArgs.protocolFactory(new TBinaryProtocol.Factory());
        // 使用非阻塞式IO，服务端和客户端需要指定TFramedTransport数据传输的方式
        TServer m_server = new TNonblockingServer(tnbArgs);
        System.out.println("service at port: " + 9000);
        m_server.serve();
    }

}
