public final class d72 extends pr1 implements bd0 {
  public int g;
  
  public x80 h;
  
  public Object[] i;
  
  public final Object c(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject3 = new pr1(3, (cs)paramObject3);
    ((d72)paramObject3).h = (x80)paramObject1;
    ((d72)paramObject3).i = (Object[])paramObject2;
    return paramObject3.n(l02.a);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    ys ys = null;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      jr jr;
      dd1.r0(paramObject);
      x80 x801 = this.h;
      lr[] arrayOfLr = (lr[])this.i;
      int j = arrayOfLr.length;
      i = 0;
      while (true) {
        jr = jr.a;
        paramObject = ys;
        if (i < j) {
          paramObject = arrayOfLr[i];
          if (!ui0.c(paramObject, jr))
            break; 
          i++;
          continue;
        } 
        break;
      } 
      if (paramObject == null)
        paramObject = jr; 
      this.g = 1;
      paramObject = x801.k(paramObject, this);
      ys = ys.b;
      if (paramObject == ys)
        return ys; 
    } 
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */