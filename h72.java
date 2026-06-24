import android.content.ContentValues;
import android.text.TextUtils;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.util.Iterator;

public final class h72 extends qx0 {
  public final int c;
  
  public final Object d = new Object();
  
  public h72(int paramInt) {
    super(19, 20);
  }
  
  public final void b(th1 paramth1) {
    ac0 ac0;
    int i = this.c;
    paramth1.getClass();
    switch (i) {
      default:
        m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        m92.n(paramth1, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        m92.n(paramth1, "DROP TABLE `WorkSpec`");
        m92.n(paramth1, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        if (paramth1 instanceof er1) {
          ac0 = ((er1)paramth1).b;
          ac0.getClass();
          ac0.h("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
        } 
        return;
      case 0:
        break;
    } 
    m92.n((th1)ac0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
    m92.n((th1)ac0, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
    m92.n((th1)ac0, "DROP TABLE `WorkSpec`");
    m92.n((th1)ac0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
    m92.n((th1)ac0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
    m92.n((th1)ac0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
    if (ac0 instanceof er1) {
      ac0 ac01 = ((er1)ac0).b;
      ac01.getClass();
      ac01.h("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
      ContentValues contentValues = new ContentValues(1);
      contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
      boolean bool = false;
      Object[] arrayOfObject = new Object[0];
      if (contentValues.size() != 0) {
        StringBuilder stringBuilder1;
        int j = contentValues.size();
        int k = arrayOfObject.length + j;
        Object[] arrayOfObject1 = new Object[k];
        StringBuilder stringBuilder2 = new StringBuilder("UPDATE ");
        stringBuilder2.append(ac0.c[3]);
        stringBuilder2.append("WorkSpec SET ");
        Iterator<String> iterator = contentValues.keySet().iterator();
        for (i = 0; iterator.hasNext(); i++) {
          String str1;
          String str2 = iterator.next();
          if (i > 0) {
            str1 = ",";
          } else {
            str1 = "";
          } 
          stringBuilder2.append(str1);
          stringBuilder2.append(str2);
          arrayOfObject1[i] = contentValues.get(str2);
          stringBuilder2.append("=?");
        } 
        for (i = j; i < k; i++)
          arrayOfObject1[i] = arrayOfObject[i - j]; 
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 "))
          stringBuilder2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 "); 
        hc0 hc0 = ac01.d(stringBuilder2.toString());
        i = bool;
        while (i < k) {
          Object object = arrayOfObject1[i];
          i++;
          if (object == null) {
            hc0.b(i);
            continue;
          } 
          if (object instanceof byte[]) {
            object = object;
            hc0.b.bindBlob(i, (byte[])object);
            continue;
          } 
          if (object instanceof Float) {
            double d = ((Number)object).floatValue();
            hc0.n(d, i);
            continue;
          } 
          if (object instanceof Double) {
            double d = ((Number)object).doubleValue();
            hc0.n(d, i);
            continue;
          } 
          if (object instanceof Long) {
            long l = ((Number)object).longValue();
            hc0.e(i, l);
            continue;
          } 
          if (object instanceof Integer) {
            long l = ((Number)object).intValue();
            hc0.e(i, l);
            continue;
          } 
          if (object instanceof Short) {
            long l = ((Number)object).shortValue();
            hc0.e(i, l);
            continue;
          } 
          if (object instanceof Byte) {
            long l = ((Number)object).byteValue();
            hc0.e(i, l);
            continue;
          } 
          if (object instanceof String) {
            object = object;
            hc0.b.bindString(i, (String)object);
            continue;
          } 
          if (object instanceof Boolean) {
            long l;
            if (((Boolean)object).booleanValue()) {
              l = 1L;
            } else {
              l = 0L;
            } 
            hc0.e(i, l);
            continue;
          } 
          stringBuilder1 = new StringBuilder("Cannot bind ");
          stringBuilder1.append(object);
          stringBuilder1.append(" at index ");
          stringBuilder1.append(i);
          stringBuilder1.append(OETETTfAjV.IxpL);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
        ((hc0)stringBuilder1).c.executeUpdateDelete();
      } else {
        l0.l("Empty values");
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */