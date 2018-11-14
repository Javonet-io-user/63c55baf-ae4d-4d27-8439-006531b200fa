package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;public class RollingFileAppender extends FileAppender implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDatePattern (java.lang.String value){ try { javonetHandle.set("DatePattern",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDatePattern (){ try { return  (java.lang.String) javonetHandle.get("DatePattern");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMaxSizeRollBackups (java.lang.Integer value){ try { javonetHandle.set("MaxSizeRollBackups",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaxSizeRollBackups (){ try { return javonetHandle.get("MaxSizeRollBackups");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setMaxFileSize (java.lang.Long value){ try { javonetHandle.set("MaxFileSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getMaxFileSize (){ try { return javonetHandle.get("MaxFileSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMaximumFileSize (java.lang.String value){ try { javonetHandle.set("MaximumFileSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaximumFileSize (){ try { return  (java.lang.String) javonetHandle.get("MaximumFileSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCountDirection (java.lang.Integer value){ try { javonetHandle.set("CountDirection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getCountDirection (){ try { return javonetHandle.get("CountDirection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setRollingStyle (RollingMode value){ try { javonetHandle.set("RollingStyle",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public RollingMode getRollingStyle (){ try { return RollingMode.valueOf(((NEnum) javonetHandle.get("RollingStyle")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setStaticLogFileName (java.lang.Boolean value){ try { javonetHandle.set("StaticLogFileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getStaticLogFileName (){ try { return javonetHandle.get("StaticLogFileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public RollingFileAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("RollingFileAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RollingFileAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } } public enum RollingMode{Once(0L),Size(1L),Date(2L),Composite(3L),; private long numVal;RollingMode(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }public static abstract class IDateTime {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.util.Date getNow (){ try { return javonetHandle.get("Now");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public IDateTime(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}