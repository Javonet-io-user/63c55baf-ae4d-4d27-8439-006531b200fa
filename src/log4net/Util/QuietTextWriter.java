package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import log4net.Core.*;
import jio.System.IO.*;public class QuietTextWriter extends TextWriterAdapter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setErrorHandler (IErrorHandler value){ try { javonetHandle.set("ErrorHandler",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IErrorHandler getErrorHandler (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("ErrorHandler"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getClosed (){ try { return javonetHandle.get("Closed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public QuietTextWriter (TextWriter writer,IErrorHandler errorHandler){  super((NObject) null); try {  javonetHandle = Javonet.New("QuietTextWriter",writer,errorHandler); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QuietTextWriter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public void Write (java.lang.String value){ try { javonetHandle.invoke("Write",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Close (){ try { javonetHandle.invoke("Close");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}