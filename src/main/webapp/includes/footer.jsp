<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/18/2024
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
    <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
    <%
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
    %>
<p>&copy; Copyright <%= currentYear %> Mike Murach &amp; Associates</p>
</body>
</html>
