import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class e12 extends X509Certificate {
  public final int b;
  
  public final X509Certificate c;
  
  public final byte[] e;
  
  public e12(X509Certificate paramX509Certificate, byte[] paramArrayOfbyte, int paramInt) {
    this.c = paramX509Certificate;
    this.e = paramArrayOfbyte;
  }
  
  public final void checkValidity() {
    switch (this.b) {
      default:
        this.c.checkValidity();
        return;
      case 0:
        break;
    } 
    this.c.checkValidity();
  }
  
  public final void checkValidity(Date paramDate) {
    switch (this.b) {
      default:
        this.c.checkValidity(paramDate);
        return;
      case 0:
        break;
    } 
    this.c.checkValidity(paramDate);
  }
  
  public final int getBasicConstraints() {
    switch (this.b) {
      default:
        return this.c.getBasicConstraints();
      case 0:
        break;
    } 
    return this.c.getBasicConstraints();
  }
  
  public final Set getCriticalExtensionOIDs() {
    switch (this.b) {
      default:
        return this.c.getCriticalExtensionOIDs();
      case 0:
        break;
    } 
    return this.c.getCriticalExtensionOIDs();
  }
  
  public final byte[] getEncoded() {
    int i = this.b;
    byte[] arrayOfByte = this.e;
    switch (i) {
      default:
        return arrayOfByte;
      case 0:
        break;
    } 
    if (arrayOfByte != null) {
      arrayOfByte = (byte[])arrayOfByte.clone();
    } else {
      arrayOfByte = null;
    } 
    return arrayOfByte;
  }
  
  public List getExtendedKeyUsage() {
    switch (this.b) {
      default:
        return super.getExtendedKeyUsage();
      case 0:
        break;
    } 
    return this.c.getExtendedKeyUsage();
  }
  
  public final byte[] getExtensionValue(String paramString) {
    switch (this.b) {
      default:
        return this.c.getExtensionValue(paramString);
      case 0:
        break;
    } 
    return this.c.getExtensionValue(paramString);
  }
  
  public Collection getIssuerAlternativeNames() {
    switch (this.b) {
      default:
        return super.getIssuerAlternativeNames();
      case 0:
        break;
    } 
    return this.c.getIssuerAlternativeNames();
  }
  
  public final Principal getIssuerDN() {
    switch (this.b) {
      default:
        return this.c.getIssuerDN();
      case 0:
        break;
    } 
    return this.c.getIssuerDN();
  }
  
  public final boolean[] getIssuerUniqueID() {
    switch (this.b) {
      default:
        return this.c.getIssuerUniqueID();
      case 0:
        break;
    } 
    return this.c.getIssuerUniqueID();
  }
  
  public X500Principal getIssuerX500Principal() {
    switch (this.b) {
      default:
        return super.getIssuerX500Principal();
      case 0:
        break;
    } 
    return this.c.getIssuerX500Principal();
  }
  
  public final boolean[] getKeyUsage() {
    switch (this.b) {
      default:
        return this.c.getKeyUsage();
      case 0:
        break;
    } 
    return this.c.getKeyUsage();
  }
  
  public final Set getNonCriticalExtensionOIDs() {
    switch (this.b) {
      default:
        return this.c.getNonCriticalExtensionOIDs();
      case 0:
        break;
    } 
    return this.c.getNonCriticalExtensionOIDs();
  }
  
  public final Date getNotAfter() {
    switch (this.b) {
      default:
        return this.c.getNotAfter();
      case 0:
        break;
    } 
    return this.c.getNotAfter();
  }
  
  public final Date getNotBefore() {
    switch (this.b) {
      default:
        return this.c.getNotBefore();
      case 0:
        break;
    } 
    return this.c.getNotBefore();
  }
  
  public final PublicKey getPublicKey() {
    switch (this.b) {
      default:
        return this.c.getPublicKey();
      case 0:
        break;
    } 
    return this.c.getPublicKey();
  }
  
  public final BigInteger getSerialNumber() {
    switch (this.b) {
      default:
        return this.c.getSerialNumber();
      case 0:
        break;
    } 
    return this.c.getSerialNumber();
  }
  
  public final String getSigAlgName() {
    switch (this.b) {
      default:
        return this.c.getSigAlgName();
      case 0:
        break;
    } 
    return this.c.getSigAlgName();
  }
  
  public final String getSigAlgOID() {
    switch (this.b) {
      default:
        return this.c.getSigAlgOID();
      case 0:
        break;
    } 
    return this.c.getSigAlgOID();
  }
  
  public final byte[] getSigAlgParams() {
    switch (this.b) {
      default:
        return this.c.getSigAlgParams();
      case 0:
        break;
    } 
    return this.c.getSigAlgParams();
  }
  
  public final byte[] getSignature() {
    switch (this.b) {
      default:
        return this.c.getSignature();
      case 0:
        break;
    } 
    return this.c.getSignature();
  }
  
  public Collection getSubjectAlternativeNames() {
    switch (this.b) {
      default:
        return super.getSubjectAlternativeNames();
      case 0:
        break;
    } 
    return this.c.getSubjectAlternativeNames();
  }
  
  public final Principal getSubjectDN() {
    switch (this.b) {
      default:
        return this.c.getSubjectDN();
      case 0:
        break;
    } 
    return this.c.getSubjectDN();
  }
  
  public final boolean[] getSubjectUniqueID() {
    switch (this.b) {
      default:
        return this.c.getSubjectUniqueID();
      case 0:
        break;
    } 
    return this.c.getSubjectUniqueID();
  }
  
  public X500Principal getSubjectX500Principal() {
    switch (this.b) {
      default:
        return super.getSubjectX500Principal();
      case 0:
        break;
    } 
    return this.c.getSubjectX500Principal();
  }
  
  public final byte[] getTBSCertificate() {
    switch (this.b) {
      default:
        return this.c.getTBSCertificate();
      case 0:
        break;
    } 
    return this.c.getTBSCertificate();
  }
  
  public final int getVersion() {
    switch (this.b) {
      default:
        return this.c.getVersion();
      case 0:
        break;
    } 
    return this.c.getVersion();
  }
  
  public final boolean hasUnsupportedCriticalExtension() {
    switch (this.b) {
      default:
        return this.c.hasUnsupportedCriticalExtension();
      case 0:
        break;
    } 
    return this.c.hasUnsupportedCriticalExtension();
  }
  
  public final String toString() {
    switch (this.b) {
      default:
        return this.c.toString();
      case 0:
        break;
    } 
    return this.c.toString();
  }
  
  public final void verify(PublicKey paramPublicKey) {
    switch (this.b) {
      default:
        this.c.verify(paramPublicKey);
        return;
      case 0:
        break;
    } 
    this.c.verify(paramPublicKey);
  }
  
  public final void verify(PublicKey paramPublicKey, String paramString) {
    switch (this.b) {
      default:
        this.c.verify(paramPublicKey, paramString);
        return;
      case 0:
        break;
    } 
    this.c.verify(paramPublicKey, paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */