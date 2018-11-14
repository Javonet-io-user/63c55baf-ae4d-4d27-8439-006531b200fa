package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.IO.*;
import jio.System.*;public abstract class PatternConverter {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PatternConverter getNext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Next"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFormattingInfo (FormattingInfo value){ try { javonetHandle.set("FormattingInfo",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FormattingInfo getFormattingInfo (){ try { return new FormattingInfo((NObject)javonetHandle.get("FormattingInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setOption (java.lang.String value){ try { javonetHandle.set("Option",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getOption (){ try { return  (java.lang.String) javonetHandle.get("Option");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PatternConverter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public PatternConverter SetNext (PatternConverter patternConverter){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("SetNext",patternConverter));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Format (TextWriter writer,NObject state){ try { javonetHandle.invoke("Format",writer,state);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}