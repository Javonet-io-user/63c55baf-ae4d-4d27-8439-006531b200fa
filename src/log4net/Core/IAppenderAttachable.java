package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import log4net.Appender.*;public interface IAppenderAttachable { public void AddAppender (IAppender appender);public IAppender GetAppender (java.lang.String name);public void RemoveAllAppenders ();public IAppender RemoveAppender (IAppender appender);public IAppender RemoveAppender (java.lang.String name);}