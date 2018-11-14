package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import jio.System.Net.Mail.*;public class SmtpAppender extends BufferingAppenderSkeleton {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTo (java.lang.String value){ try { javonetHandle.set("To",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTo (){ try { return  (java.lang.String) javonetHandle.get("To");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFrom (java.lang.String value){ try { javonetHandle.set("From",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFrom (){ try { return  (java.lang.String) javonetHandle.get("From");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubject (java.lang.String value){ try { javonetHandle.set("Subject",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubject (){ try { return  (java.lang.String) javonetHandle.get("Subject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSmtpHost (java.lang.String value){ try { javonetHandle.set("SmtpHost",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSmtpHost (){ try { return  (java.lang.String) javonetHandle.get("SmtpHost");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLocationInfo (java.lang.Boolean value){ try { javonetHandle.set("LocationInfo",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLocationInfo (){ try { return javonetHandle.get("LocationInfo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setAuthentication (SmtpAuthentication value){ try { javonetHandle.set("Authentication",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SmtpAuthentication getAuthentication (){ try { return SmtpAuthentication.valueOf(((NEnum) javonetHandle.get("Authentication")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUsername (java.lang.String value){ try { javonetHandle.set("Username",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUsername (){ try { return  (java.lang.String) javonetHandle.get("Username");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPassword (java.lang.String value){ try { javonetHandle.set("Password",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPassword (){ try { return  (java.lang.String) javonetHandle.get("Password");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPort (java.lang.Integer value){ try { javonetHandle.set("Port",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getPort (){ try { return javonetHandle.get("Port");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setPriority (MailPriority value){ try { javonetHandle.set("Priority",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public MailPriority getPriority (){ try { return MailPriority.valueOf(((NEnum) javonetHandle.get("Priority")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SmtpAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("SmtpAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SmtpAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                } public enum SmtpAuthentication{None(0L),Basic(1L),Ntlm(2L),; private long numVal;SmtpAuthentication(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}