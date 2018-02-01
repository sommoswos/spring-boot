<!DOCTYPE html>  
<html>  
<body>
	${name}
	<#if sex=='1'>
		男
	<#elseif sex=='2'>
		女
	<#else>
		其他
	</#if>
	<#list listUser as user>
		${user}
	</#list>
</body>
</html>  