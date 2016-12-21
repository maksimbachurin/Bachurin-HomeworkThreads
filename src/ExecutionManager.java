/**
 * Created by Максим on 21.12.2016.
 */
public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);
}
