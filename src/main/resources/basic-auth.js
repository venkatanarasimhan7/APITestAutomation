function fn() {
  var Base64 = Java.type('java.util.Base64');
  var temp = 'OB2User1Uat:X1so5Blt2H'; 
  var encoded = Base64.getEncoder().encodeToString(temp.bytes);
  return 'Basic ' + encoded;
}