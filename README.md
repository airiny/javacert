javacert
========

Connect to SSL Services from Java when PKIX Path Building Failed

Many Java applications have problem to connect to self-signed SSL services firing the following error: "Unable to Connect to SSL Services due to PKIX Path Building Failed sun.security.provider.certpath.SunCertPathBuilderException".

This solution is based on Sun (C) InstallCert code.

Usage:

   java javacert-0.0.1-SNAPSHOT.jar [your.domain.name:port]
   
   REM: no protocol prefix needed
   
