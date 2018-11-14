package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.IO.*;
import log4net.Core.*;public class CountingQuietTextWriter extends QuietTextWriter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCount (java.lang.Long value){ try { javonetHandle.set("Count",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CountingQuietTextWriter (TextWriter writer,IErrorHandler errorHandler){  super((NObject) null); try {  javonetHandle = Javonet.New("CountingQuietTextWriter",writer,errorHandler); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CountingQuietTextWriter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Write (java.lang.Character value){ try { javonetHandle.invoke("Write",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Write (java.lang.Character[] buffer,java.lang.Integer index,java.lang.Integer count){ try { javonetHandle.invoke("Write",new Object[] {buffer},index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Write (java.lang.String str){ try { javonetHandle.invoke("Write",str);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}