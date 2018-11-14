package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;public class LogLog {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public static void setInternalDebugging (java.lang.Boolean value){ try { Javonet.getType("LogLog").set("InternalDebugging",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getInternalDebugging (){ try { return Javonet.getType("LogLog").get("InternalDebugging");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public static void setQuietMode (java.lang.Boolean value){ try { Javonet.getType("LogLog").set("QuietMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getQuietMode (){ try { return Javonet.getType("LogLog").get("QuietMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getIsDebugEnabled (){ try { return Javonet.getType("LogLog").get("IsDebugEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getIsWarnEnabled (){ try { return Javonet.getType("LogLog").get("IsWarnEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getIsErrorEnabled (){ try { return Javonet.getType("LogLog").get("IsErrorEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public LogLog(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void Debug (java.lang.String message){ try { Javonet.getType("LogLog").invoke("Debug",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void Debug (java.lang.String message,jio.System.Exception exception){ try { Javonet.getType("LogLog").invoke("Debug",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void Warn (java.lang.String message){ try { Javonet.getType("LogLog").invoke("Warn",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void Warn (java.lang.String message,jio.System.Exception exception){ try { Javonet.getType("LogLog").invoke("Warn",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void Error (java.lang.String message){ try { Javonet.getType("LogLog").invoke("Error",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void Error (java.lang.String message,jio.System.Exception exception){ try { Javonet.getType("LogLog").invoke("Error",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}