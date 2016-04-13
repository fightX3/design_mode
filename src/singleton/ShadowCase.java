package singleton;

import java.util.Vector;

/**
 * 采用"影子实例"的办法为单例对象的属性同步更新
 * @author xf
 *
 */
public class ShadowCase {

    private static ShadowCase instance = null;  

    private Vector properties = null;  

    public Vector getProperties() {  

        return properties;  
    }  

    private ShadowCase() {  

    }  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new ShadowCase();  
        }  
    }  

    public static ShadowCase getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  

    public void updateProperties() {  
    	ShadowCase shadow = new ShadowCase();  
        properties = shadow.getProperties();  
    }  
}
