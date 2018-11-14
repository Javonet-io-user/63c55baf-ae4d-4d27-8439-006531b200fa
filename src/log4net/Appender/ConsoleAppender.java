package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Layout.*;public class ConsoleAppender extends AppenderSkeleton {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTarget (java.lang.String value){ try { javonetHandle.set("Target",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTarget (){ try { return  (java.lang.String) javonetHandle.get("Target");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public static java.lang.String getConsoleOut (){ try { return  (java.lang.String) Javonet.getType("ConsoleAppender").get("ConsoleOut");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setConsoleOut (java.lang.String param){ try { Javonet.getType("ConsoleAppender").set("ConsoleOut",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getConsoleError (){ try { return  (java.lang.String) Javonet.getType("ConsoleAppender").get("ConsoleError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setConsoleError (java.lang.String param){ try { Javonet.getType("ConsoleAppender").set("ConsoleError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConsoleAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("ConsoleAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConsoleAppender (ILayout layout){  super((NObject) null); try {  javonetHandle = Javonet.New("ConsoleAppender",layout); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConsoleAppender (ILayout layout,java.lang.Boolean writeToErrorStream){  super((NObject) null); try {  javonetHandle = Javonet.New("ConsoleAppender",layout,writeToErrorStream); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConsoleAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}