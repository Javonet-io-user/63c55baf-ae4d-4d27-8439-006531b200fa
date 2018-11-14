package jio.System.IO;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.IO.*;
import jio.System.*;public class StringWriter extends TextWriter {public NObject javonetHandle; public StringWriter (){  super((NObject) null); try {  javonetHandle = Javonet.New("StringWriter"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringWriter (IFormatProvider formatProvider){  super((NObject) null); try {  javonetHandle = Javonet.New("StringWriter",formatProvider); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringWriter (jio.System.Text.StringBuilder sb){  super((NObject) null); try {  javonetHandle = Javonet.New("StringWriter",sb); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringWriter (jio.System.Text.StringBuilder sb,IFormatProvider formatProvider){  super((NObject) null); try {  javonetHandle = Javonet.New("StringWriter",sb,formatProvider); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringWriter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}