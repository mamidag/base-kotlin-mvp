package id.web.hn.basekotlinmvp.core.ext.rx

/**
 * Created by hahn on 21.06.19.
 * Project: BaseKotlinMvp
 */

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
