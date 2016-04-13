package singleton;
/**
 * SingletonXingNengLow类的问题解决-->   尤其是在写多线程环境下的程序更有难度，有挑战性。我们对该程序做进一步优化：
	
 *实 际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
 *这个类的加载过程是线程互斥的。这样当我们第一次调用 getInstance的时候，JVM能够帮我们保证instance只被创建一次，
 *并且会保证把赋值给instance的内存初始化完毕，这样我们就不 用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，
 *这样就解决了低性能问题。	
 *
 *
 *其 实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 *所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合 自己应用场景的实现方法
 *。也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，
 *单独为创建加 synchronized关键字，也是可以的：
 * @author xf
 *
 */
public class SingletonMuitThread {
	

	private static class SingletonFactory{           
	
	    private static SingletonMuitThread instance = new SingletonMuitThread();           
	
	}    

    /* 私有构造方法，防止被实例化 */  

    private SingletonMuitThread() {  
    	
    }  
    /* 静态工程方法，创建实例 */  

    public static  SingletonMuitThread getInstance() {  
        return SingletonFactory.instance;
    }  

  

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  

    public Object readResolve() {  

        return getInstance();  

    }  
}
