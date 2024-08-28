import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{

    private List<String> mensagens = new LinkedList<>();

    public LogSimples(){}

    private static class SingletonHolder{
        private static LogSimples instanceLogSimples = new LogSimples();
    }

    public static LogSimples getLog() {
        return SingletonHolder.instanceLogSimples;
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
         mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
