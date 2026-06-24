import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class j72 extends f51 {
  public final WorkDatabase_Impl d;
  
  public j72(WorkDatabase_Impl paramWorkDatabase_Impl) {
    super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
  }
  
  public final void a(th1 paramth1) {
    paramth1.getClass();
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    m92.n(paramth1, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    m92.n(paramth1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
  }
  
  public final void c(th1 paramth1) {
    paramth1.getClass();
    m92.n(paramth1, "DROP TABLE IF EXISTS `Dependency`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `WorkSpec`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `WorkTag`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `SystemIdInfo`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `WorkName`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `WorkProgress`");
    m92.n(paramth1, "DROP TABLE IF EXISTS `Preference`");
  }
  
  public final void s(th1 paramth1) {
    paramth1.getClass();
  }
  
  public final void t(th1 paramth1) {
    paramth1.getClass();
    m92.n(paramth1, "PRAGMA foreign_keys = ON");
    yi0 yi0 = this.d.f();
    jx1 jx1 = yi0.b;
    jx1.getClass();
    ai1 ai1 = paramth1.O("PRAGMA query_only");
    try {
      ai1.L();
      boolean bool = false;
      long l = ai1.getLong(0);
      if (l != 0L)
        bool = true; 
      z51.d(ai1, null);
      if (!bool) {
        m92.n(paramth1, "PRAGMA temp_store = MEMORY");
        m92.n(paramth1, "PRAGMA recursive_triggers = 1");
        m92.n(paramth1, "DROP TABLE IF EXISTS room_table_modification_log");
        if (jx1.d) {
          m92.n(paramth1, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
        } else {
          m92.n(paramth1, oq1.E0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
        } 
        null = jx1.h;
        ReentrantLock reentrantLock = (ReentrantLock)null.b;
        reentrantLock.lock();
        try {
          null.a = true;
        } finally {
          reentrantLock.unlock();
        } 
      } 
      Object object = yi0.g;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } finally {
      paramth1 = null;
    } 
  }
  
  public final void u(th1 paramth1) {
    paramth1.getClass();
  }
  
  public final void v(th1 paramth1) {
    paramth1.getClass();
    tn0 tn0 = new tn0(10);
    ai1 ai1 = paramth1.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
    try {
      while (ai1.L())
        tn0.add(ai1.j(0)); 
    } finally {}
    z51.d(ai1, null);
    ListIterator listIterator = zo2.b(tn0).listIterator(0);
    while (true) {
      rn0 rn0 = (rn0)listIterator;
      if (rn0.hasNext()) {
        String str = (String)rn0.next();
        if (oq1.G0(str, "room_fts_content_sync_"))
          m92.n(paramth1, "DROP TRIGGER IF EXISTS ".concat(str)); 
        continue;
      } 
      break;
    } 
  }
  
  public final fh1 w(th1 paramth1) {
    StringBuilder stringBuilder;
    paramth1.getClass();
    LinkedHashMap<Object, Object> linkedHashMap6 = new LinkedHashMap<Object, Object>();
    linkedHashMap6.put("work_spec_id", new ct1("work_spec_id", "TEXT", true, 1, null, 1));
    linkedHashMap6.put("prerequisite_id", new ct1("prerequisite_id", "TEXT", true, 2, null, 1));
    LinkedHashSet<dt1> linkedHashSet8 = new LinkedHashSet();
    linkedHashSet8.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("work_spec_id"), zo2.E("id")));
    linkedHashSet8.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("prerequisite_id"), zo2.E("id")));
    LinkedHashSet<et1> linkedHashSet7 = new LinkedHashSet();
    List list1 = zo2.E("work_spec_id");
    String str = LHyji.oZwmuIApQ;
    linkedHashSet7.add(new et1("index_Dependency_work_spec_id", false, list1, zo2.E(str)));
    linkedHashSet7.add(new et1("index_Dependency_prerequisite_id", false, zo2.E("prerequisite_id"), zo2.E(str)));
    ft1 ft114 = new ft1("Dependency", linkedHashMap6, linkedHashSet8, linkedHashSet7);
    ft1 ft110 = z51.F(paramth1, "Dependency");
    if (!ft114.equals(ft110)) {
      stringBuilder = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
      stringBuilder.append(ft114);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft110);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap3 = new LinkedHashMap<Object, Object>();
    linkedHashMap3.put("id", new ct1("id", "TEXT", true, 1, null, 1));
    linkedHashMap3.put("state", new ct1("state", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("worker_class_name", new ct1("worker_class_name", "TEXT", true, 0, null, 1));
    linkedHashMap3.put("input_merger_class_name", new ct1("input_merger_class_name", "TEXT", true, 0, null, 1));
    linkedHashMap3.put("input", new ct1("input", "BLOB", true, 0, null, 1));
    linkedHashMap3.put("output", new ct1("output", "BLOB", true, 0, null, 1));
    linkedHashMap3.put("initial_delay", new ct1("initial_delay", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("interval_duration", new ct1("interval_duration", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("flex_duration", new ct1("flex_duration", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("run_attempt_count", new ct1("run_attempt_count", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("backoff_policy", new ct1("backoff_policy", "INTEGER", true, 0, null, 1));
    ct1 ct1 = new ct1(LHyji.ZnmmlKJTkEf, "INTEGER", true, 0, null, 1);
    linkedHashMap3.put(zLtYiJUm.MIkboTkFbly, ct1);
    linkedHashMap3.put("last_enqueue_time", new ct1("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
    linkedHashMap3.put("minimum_retention_duration", new ct1("minimum_retention_duration", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("schedule_requested_at", new ct1("schedule_requested_at", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("run_in_foreground", new ct1("run_in_foreground", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("out_of_quota_policy", new ct1("out_of_quota_policy", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("period_count", new ct1("period_count", "INTEGER", true, 0, ckOPp.KIxgDuv, 1));
    linkedHashMap3.put("generation", new ct1("generation", "INTEGER", true, 0, "0", 1));
    linkedHashMap3.put("next_schedule_time_override", new ct1("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
    linkedHashMap3.put("next_schedule_time_override_generation", new ct1("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
    linkedHashMap3.put("stop_reason", new ct1("stop_reason", "INTEGER", true, 0, "-256", 1));
    linkedHashMap3.put("trace_tag", new ct1("trace_tag", "TEXT", false, 0, null, 1));
    linkedHashMap3.put("backoff_on_system_interruptions", new ct1("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
    linkedHashMap3.put("required_network_type", new ct1("required_network_type", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("required_network_request", new ct1("required_network_request", "BLOB", true, 0, "x''", 1));
    linkedHashMap3.put("requires_charging", new ct1("requires_charging", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("requires_device_idle", new ct1(OETETTfAjV.fBcLZJFD, "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("requires_battery_not_low", new ct1("requires_battery_not_low", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("requires_storage_not_low", new ct1("requires_storage_not_low", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("trigger_content_update_delay", new ct1("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("trigger_max_content_delay", new ct1("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
    linkedHashMap3.put("content_uri_triggers", new ct1("content_uri_triggers", "BLOB", true, 0, null, 1));
    linkedHashSet8 = new LinkedHashSet<dt1>();
    LinkedHashSet<et1> linkedHashSet9 = new LinkedHashSet();
    linkedHashSet9.add(new et1("index_WorkSpec_schedule_requested_at", false, zo2.E("schedule_requested_at"), zo2.E(str)));
    List list2 = zo2.E("last_enqueue_time");
    List list3 = zo2.E(str);
    linkedHashSet9.add(new et1(hbrAVtEa.qefWVrJT, false, list2, list3));
    ft1 ft19 = new ft1("WorkSpec", linkedHashMap3, linkedHashSet8, linkedHashSet9);
    ft1 ft113 = z51.F((th1)stringBuilder, "WorkSpec");
    if (!ft19.equals(ft113)) {
      stringBuilder = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
      stringBuilder.append(ft19);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft113);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap7 = new LinkedHashMap<Object, Object>();
    linkedHashMap7.put("tag", new ct1("tag", "TEXT", true, 1, null, 1));
    linkedHashMap7.put("work_spec_id", new ct1("work_spec_id", "TEXT", true, 2, null, 1));
    LinkedHashSet<dt1> linkedHashSet4 = new LinkedHashSet();
    linkedHashSet4.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("work_spec_id"), zo2.E("id")));
    LinkedHashSet<et1> linkedHashSet5 = new LinkedHashSet();
    linkedHashSet5.add(new et1("index_WorkTag_work_spec_id", false, zo2.E("work_spec_id"), zo2.E(str)));
    ft1 ft18 = new ft1("WorkTag", linkedHashMap7, linkedHashSet4, linkedHashSet5);
    ft1 ft112 = z51.F((th1)stringBuilder, "WorkTag");
    if (!ft18.equals(ft112)) {
      stringBuilder = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
      stringBuilder.append(ft18);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft112);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap5 = new LinkedHashMap<Object, Object>();
    linkedHashMap5.put("work_spec_id", new ct1("work_spec_id", "TEXT", true, 1, null, 1));
    linkedHashMap5.put("generation", new ct1("generation", "INTEGER", true, 2, "0", 1));
    linkedHashMap5.put("system_id", new ct1("system_id", "INTEGER", true, 0, null, 1));
    LinkedHashSet<dt1> linkedHashSet3 = new LinkedHashSet();
    linkedHashSet3.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("work_spec_id"), zo2.E("id")));
    ft1 ft111 = new ft1("SystemIdInfo", linkedHashMap5, linkedHashSet3, new LinkedHashSet());
    ft1 ft17 = z51.F((th1)stringBuilder, "SystemIdInfo");
    if (!ft111.equals(ft17)) {
      stringBuilder = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
      stringBuilder.append(ft111);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft17);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap4 = new LinkedHashMap<Object, Object>();
    linkedHashMap4.put("name", new ct1("name", "TEXT", true, 1, null, 1));
    linkedHashMap4.put("work_spec_id", new ct1("work_spec_id", "TEXT", true, 2, null, 1));
    LinkedHashSet<dt1> linkedHashSet2 = new LinkedHashSet();
    linkedHashSet2.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("work_spec_id"), zo2.E("id")));
    LinkedHashSet<et1> linkedHashSet6 = new LinkedHashSet();
    linkedHashSet6.add(new et1("index_WorkName_work_spec_id", false, zo2.E("work_spec_id"), zo2.E(str)));
    ft1 ft16 = new ft1("WorkName", linkedHashMap4, linkedHashSet2, linkedHashSet6);
    ft1 ft14 = z51.F((th1)stringBuilder, "WorkName");
    if (!ft16.equals(ft14)) {
      stringBuilder = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
      stringBuilder.append(ft16);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft14);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
    linkedHashMap2.put("work_spec_id", new ct1("work_spec_id", "TEXT", true, 1, null, 1));
    linkedHashMap2.put("progress", new ct1("progress", "BLOB", true, 0, null, 1));
    LinkedHashSet<dt1> linkedHashSet1 = new LinkedHashSet();
    linkedHashSet1.add(new dt1("WorkSpec", "CASCADE", "CASCADE", zo2.E("work_spec_id"), zo2.E("id")));
    ft1 ft13 = new ft1("WorkProgress", linkedHashMap2, linkedHashSet1, new LinkedHashSet());
    ft1 ft15 = z51.F((th1)stringBuilder, "WorkProgress");
    if (!ft13.equals(ft15)) {
      stringBuilder = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
      stringBuilder.append(ft13);
      stringBuilder.append("\n Found:\n");
      stringBuilder.append(ft15);
      return new fh1(false, stringBuilder.toString());
    } 
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>();
    linkedHashMap1.put("key", new ct1("key", "TEXT", true, 1, null, 1));
    linkedHashMap1.put("long_value", new ct1("long_value", "INTEGER", false, 0, null, 1));
    ft1 ft12 = new ft1("Preference", linkedHashMap1, new LinkedHashSet(), new LinkedHashSet());
    ft1 ft11 = z51.F((th1)stringBuilder, "Preference");
    if (!ft12.equals(ft11)) {
      StringBuilder stringBuilder1 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
      stringBuilder1.append(ft12);
      stringBuilder1.append("\n Found:\n");
      stringBuilder1.append(ft11);
      return new fh1(false, stringBuilder1.toString());
    } 
    return new fh1(true, null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */