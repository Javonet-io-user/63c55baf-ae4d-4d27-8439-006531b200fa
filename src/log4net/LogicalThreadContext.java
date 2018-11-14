package log4net;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.*;
import log4net.Util.*;public class LogicalThreadContext {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static LogicalThreadContextProperties getProperties (){ try { return new LogicalThreadContextProperties((NObject)Javonet.getType("LogicalThreadContext").get("Properties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public static ThreadContextStacks getStacks (){ try { return new ThreadContextStacks((NObject)Javonet.getType("LogicalThreadContext").get("Stacks"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LogicalThreadContext(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}