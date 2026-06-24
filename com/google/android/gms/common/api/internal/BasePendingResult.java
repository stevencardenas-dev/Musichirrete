package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import cl;
import com.google.android.gms.common.api.Status;
import dl;
import ed;
import fl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import n21;
import oo2;
import rf;
import sg1;
import tp;

public abstract class BasePendingResult<R extends sg1> {
  public static final int k = 0;
  
  public final Object a = new Object();
  
  public final ed b = (ed)new cl(Looper.getMainLooper(), 4);
  
  public final CountDownLatch c = new CountDownLatch(1);
  
  public final ArrayList d = new ArrayList();
  
  public oo2 e;
  
  public final AtomicReference f = new AtomicReference();
  
  public sg1 g;
  
  public volatile boolean h;
  
  public boolean i;
  
  public boolean j;
  
  static {
    new rf(3);
  }
  
  public BasePendingResult() {
    new WeakReference(null);
  }
  
  public final void a() {
    synchronized (this.a) {
      if (this.i || this.h)
        return; 
      this.i = true;
      h(b(Status.i));
      return;
    } 
  }
  
  public abstract sg1 b(Status paramStatus);
  
  public final void c(Status paramStatus) {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (!d()) {
        e(b(paramStatus));
        this.j = true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final boolean d() {
    return (this.c.getCount() == 0L);
  }
  
  public final void e(sg1 paramsg1) {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (!this.j && !this.i) {
        d();
        n21.q("Results have already been set", d() ^ true);
        n21.q("Result has already been consumed", this.h ^ true);
        h(paramsg1);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void f(oo2 paramoo2) {
    Object object2;
    Object object1 = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      n21.q("Result has already been consumed.", this.h ^ true);
      object2 = this.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        boolean bool = this.i;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        if (bool) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } 
        if (d()) {
          object2 = this.b;
          sg1 sg11 = g();
          object2.getClass();
          Pair pair = new Pair();
          this(paramoo2, sg11);
          object2.sendMessage(object2.obtainMessage(1, pair));
        } else {
          this.e = paramoo2;
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } finally {}
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    throw paramoo2;
  }
  
  public final sg1 g() {
    synchronized (this.a) {
      n21.q("Result has already been consumed.", this.h ^ true);
      n21.q("Result is not ready.", d());
      sg1 sg11 = this.g;
      this.g = null;
      this.e = null;
      this.h = true;
      if (this.f.getAndSet(null) == null) {
        n21.m(sg11);
        return sg11;
      } 
      tp.b();
      return null;
    } 
  }
  
  public final void h(sg1 paramsg1) {
    this.g = paramsg1;
    paramsg1.b();
    this.c.countDown();
    if (this.i) {
      this.e = null;
    } else {
      oo2 oo21 = this.e;
      if (oo21 != null) {
        ed ed1 = this.b;
        ed1.removeMessages(2);
        ed1.sendMessage(ed1.obtainMessage(1, new Pair(oo21, g())));
      } 
    } 
    ArrayList arrayList = this.d;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      fl fl = ((dl)arrayList.get(b)).a;
      fl.F = 0;
      fl.S = null;
    } 
    arrayList.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\common\api\internal\BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */