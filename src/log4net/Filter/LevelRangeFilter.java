package log4net.Filter;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Filter.*;
import log4net.Core.*;public class LevelRangeFilter extends FilterSkeleton implements IFilter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAcceptOnMatch (java.lang.Boolean value){ try { javonetHandle.set("AcceptOnMatch",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAcceptOnMatch (){ try { return javonetHandle.get("AcceptOnMatch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setLevelMin (Level value){ try { javonetHandle.set("LevelMin",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getLevelMin (){ try { return new Level((NObject)javonetHandle.get("LevelMin"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLevelMax (Level value){ try { javonetHandle.set("LevelMax",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getLevelMax (){ try { return new Level((NObject)javonetHandle.get("LevelMax"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LevelRangeFilter (){  super((NObject) null); try {  javonetHandle = Javonet.New("LevelRangeFilter"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelRangeFilter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public FilterDecision Decide (LoggingEvent loggingEvent){ try { return FilterDecision.valueOf(((NEnum) javonetHandle.invoke("Decide",loggingEvent)).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}