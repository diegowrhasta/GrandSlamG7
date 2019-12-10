function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsNro( f.cod.value )==0)
    Mensaje = Mensaje + 'Verifique el ID \n';
  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
