package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Layout.*;public class TraceAppender extends AppenderSkeleton {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setImmediateFlush (java.lang.Boolean value){ try { javonetHandle.set("ImmediateFlush",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getImmediateFlush (){ try { return javonetHandle.get("ImmediateFlush");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public TraceAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("TraceAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TraceAppender (ILayout layout){  super((NObject) null); try {  javonetHandle = Javonet.New("TraceAppender",layout); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TraceAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}