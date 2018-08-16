package alex.mrrok.domain.executors;

import io.reactivex.Scheduler;

public interface PostExecutionThread  {
    Scheduler getScheduler();
}
