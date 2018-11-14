package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import log4net.Util.*;
import jio.System.*;public class NullSecurityContext extends SecurityContext {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static NullSecurityContext getInstance (){ try { return new NullSecurityContext((NObject)Javonet.getType("NullSecurityContext").get("Instance"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setInstance (NullSecurityContext param){ try { Javonet.getType("NullSecurityContext").set("Instance",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NullSecurityContext(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public IDisposable Impersonate (NObject state){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Impersonate",state));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}