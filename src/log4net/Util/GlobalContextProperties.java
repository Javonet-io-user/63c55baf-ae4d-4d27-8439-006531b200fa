package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.*;public class GlobalContextProperties extends ContextPropertiesBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void get_GlobalContextPropertiesGlobalContextPropertiesItem (java.lang.String key,NObject value){ try { javonetHandle.invoke("get_GlobalContextPropertiesGlobalContextPropertiesItem",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject get_GlobalContextPropertiesGlobalContextPropertiesItem (java.lang.String key){ try { return  (NObject) javonetHandle.invoke("get_GlobalContextPropertiesGlobalContextPropertiesItem",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public GlobalContextProperties(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Remove (java.lang.String key){ try { javonetHandle.invoke("Remove",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}