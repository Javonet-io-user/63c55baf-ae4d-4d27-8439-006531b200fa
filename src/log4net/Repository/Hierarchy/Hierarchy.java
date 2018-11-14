package log4net.Repository.Hierarchy;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Repository.*;
import log4net.Repository.Hierarchy.*;
import log4net.Core.*;
import log4net.Appender.*;
import log4net.Util.*;
import jio.System.*;
import jio.System.Xml.*;public class Hierarchy extends LoggerRepositorySkeleton implements ILoggerRepository,IBasicRepositoryConfigurator,IXmlRepositoryConfigurator {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setEmittedNoAppenderWarning (java.lang.Boolean value){ try { javonetHandle.set("EmittedNoAppenderWarning",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getEmittedNoAppenderWarning (){ try { return javonetHandle.get("EmittedNoAppenderWarning");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public Logger getRoot (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Root"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLoggerFactory (ILoggerFactory value){ try { javonetHandle.set("LoggerFactory",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ILoggerFactory getLoggerFactory (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("LoggerFactory"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Hierarchy (){  super((NObject) null); try {  javonetHandle = Javonet.New("Hierarchy"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("LoggerCreatedEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoggerCreationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hierarchy (PropertiesDictionary properties){  super((NObject) null); try {  javonetHandle = Javonet.New("Hierarchy",properties); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("LoggerCreatedEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoggerCreationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hierarchy (ILoggerFactory loggerFactory){  super((NObject) null); try {  javonetHandle = Javonet.New("Hierarchy",loggerFactory); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("LoggerCreatedEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoggerCreationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hierarchy (PropertiesDictionary properties,ILoggerFactory loggerFactory){  super((NObject) null); try {  javonetHandle = Javonet.New("Hierarchy",properties,loggerFactory); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("LoggerCreatedEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoggerCreationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hierarchy(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ILogger Exists (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Exists",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILogger[] GetCurrentLoggers (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetCurrentLoggers"),ILogger[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILogger GetLogger (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetLogger",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Shutdown (){ try { javonetHandle.invoke("Shutdown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ResetConfiguration (){ try { javonetHandle.invoke("ResetConfiguration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Log (LoggingEvent logEvent){ try { javonetHandle.invoke("Log",logEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAppender[] GetAppenders (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetAppenders"),IAppender[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean IsDisabled (Level level){ try { return javonetHandle.invoke("IsDisabled",level);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Logger Hierarchy___GetLogger (java.lang.String name,ILoggerFactory factory){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetLogger",name,factory));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Configure (IAppender appender){ try { javonetHandle.invoke("Configure",appender);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Configure (XmlElement element){ try { javonetHandle.invoke("Configure",element);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< LoggerCreationEventHandler> _LoggerCreatedEventListeners = new java.util.ArrayList<LoggerCreationEventHandler>();

            public void addLoggerCreatedEvent(LoggerCreationEventHandler toAdd)
            {
                _LoggerCreatedEventListeners.add(toAdd);
            }
            public void removeLoggerCreatedEvent(LoggerCreationEventHandler toRemove)
            {
                _LoggerCreatedEventListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}