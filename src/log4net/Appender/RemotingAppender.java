package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;public class RemotingAppender extends BufferingAppenderSkeleton implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSink (java.lang.String value){ try { javonetHandle.set("Sink",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSink (){ try { return  (java.lang.String) javonetHandle.get("Sink");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RemotingAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("RemotingAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RemotingAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static abstract class IRemoteLoggingSink {protected NObject javonetHandle; public IRemoteLoggingSink(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void LogEvents (LoggingEvent[] events){ try { javonetHandle.invoke("LogEvents",new Object[] {events});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}