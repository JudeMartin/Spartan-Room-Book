<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Spartan Room Book  - Hotel booking service</h1>
        <h2>List Rooms</h2>
        
        <table class="pure-table pure-table-bordered pure-table-striped">
            <thead>
               <tr>
                  <th width="4%">S.N</th>
                  <!--  th width="12%">Name</th>
                  <th width="12%">Code</th>
                  <th width="12%">Price</th>
                  <th width="12%">Authors</th>
                  <th width="12%">ISBN</th>
                  <th width="12%">Publisher</th>
                  <th width="12%">Published On</th>
                  <th width="12%"></th-->
               </tr>
            </thead>
            <tbody>
               <c:forEach items="${listrooms}" var="room" varStatus="loopCounter">
               <p>aa</p>
               <tr>
                   <td><c:out value="${loopCounter.count}" /></td>
                   <td><c:out value="${room.id}" /></td>
                   <!-- td><c:out value="${book.code}" /></td>
                   <td><c:out value="${book.price}" /></td>
                   <td><c:out value="${book.authors}" /></td>
                   <td><c:out value="${book.isbn}" /></td>
                   <td><c:out value="${book.publisher}" /></td>
                   <td><c:out value="${book.publishedOn}" /></td>

                   <td>
                     <nobr>
                        <button onclick="editBook(${book.id});"
                                class="pure-button pure-button-primary">
                             <i class="fa fa-pencil"></i> Edit
                        </button>

                        <a href="delete/${book.id}" class="pure-button pure-button-primary"
                   onclick="return confirm('Are you sure you want to delete this book?');">
                             <i class="fa fa-times"></i>Delete
                        </a>
                      </nobr>
                   </td-->
                </tr>
                </c:forEach>
            </tbody>
         </table>
    </body>
</html>
