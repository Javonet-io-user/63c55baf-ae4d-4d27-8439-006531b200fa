package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.IO.*;
import log4net.Util.*;
import jio.System.Text.*;
import jio.System.*;public abstract class TextWriterAdapter extends TextWriter {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Encoding getEncoding (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Encoding"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IFormatProvider getFormatProvider (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("FormatProvider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setNewLine (java.lang.String value){ try { javonetHandle.set("NewLine",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNewLine (){ try { return  (java.lang.String) javonetHandle.get("NewLine");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public TextWriterAdapter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Close (){ try { javonetHandle.invoke("Close");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Flush (){ try { javonetHandle.invoke("Flush");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Write (java.lang.Character value){ try { javonetHandle.invoke("Write",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Write (java.lang.Character[] buffer,java.lang.Integer index,java.lang.Integer count){ try { javonetHandle.invoke("Write",new Object[] {buffer},index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Write (java.lang.String value){ try { javonetHandle.invoke("Write",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}