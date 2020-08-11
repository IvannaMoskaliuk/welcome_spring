<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cafedra list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
          crossorigin="anonymous">
</head>
<body>
<h1> Hello Cafedra</h1>
<div>
    <table class="table table-dark">
        <tr>
            <th>Name</th>
            <th>Description </th>
            <th>Chief</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.description}</td>
                <td>${item.chief}</td>
                <td><a href="http://localhost:8080/web/cafedra/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger"></a>
                </td>
                <td><a href="http://localhost:8080/web/cafedra/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
            </tr>
        </#list>
    </table>
</div>
<div>
<br>
        <a href="/web/cafedra/create">
            <input type="button" value="Create Cafedra Form" style="
                    background-color: aquamarine;
                    border-color: aqua;
                    border-radius: 30px;
                    border-width: 10px;
            ">
        </a>
</div>
</body>
</html>