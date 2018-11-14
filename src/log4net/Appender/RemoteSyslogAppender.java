package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Layout.*;
import log4net.Core.*;
import log4net.Util.*;public class RemoteSyslogAppender extends UdpAppender implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIdentity (PatternLayout value){ try { javonetHandle.set("Identity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PatternLayout getIdentity (){ try { return new PatternLayout((NObject)javonetHandle.get("Identity"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFacility (SyslogFacility value){ try { javonetHandle.set("Facility",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SyslogFacility getFacility (){ try { return SyslogFacility.valueOf(((NEnum) javonetHandle.get("Facility")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public RemoteSyslogAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("RemoteSyslogAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RemoteSyslogAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddMapping (LevelSeverity mapping){ try { javonetHandle.invoke("AddMapping",mapping);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static java.lang.Integer GeneratePriority (SyslogFacility facility,SyslogSeverity severity){ try { return Javonet.getType("RemoteSyslogAppender").invoke("GeneratePriority",NEnum.fromJavaEnum(facility),NEnum.fromJavaEnum(severity));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} } public enum SyslogSeverity{Emergency(0L),Alert(1L),Critical(2L),Error(3L),Warning(4L),Notice(5L),Informational(6L),Debug(7L),; private long numVal;SyslogSeverity(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            } public enum SyslogFacility{Kernel(0L),User(1L),Mail(2L),Daemons(3L),Authorization(4L),Syslog(5L),Printer(6L),News(7L),Uucp(8L),Clock(9L),Authorization2(10L),Ftp(11L),Ntp(12L),Audit(13L),Alert(14L),Clock2(15L),Local0(16L),Local1(17L),Local2(18L),Local3(19L),Local4(20L),Local5(21L),Local6(22L),Local7(23L),; private long numVal;SyslogFacility(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }public static class LevelSeverity extends LevelMappingEntry {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSeverity (SyslogSeverity value){ try { javonetHandle.set("Severity",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SyslogSeverity getSeverity (){ try { return SyslogSeverity.valueOf(((NEnum) javonetHandle.get("Severity")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LevelSeverity (){  super((NObject) null); try {  javonetHandle = Javonet.New("LevelSeverity"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelSeverity(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}