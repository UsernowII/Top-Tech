function loginSuccess(){
    swal({
        title: "Esta seguro de cerrar sesión?",
        icon: "info",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/logout",
                    success: function(res){
                        console.log(res);
                    }
                });
                swal("Vuelva Pronto!", {
                    icon: "success",
                })
            } /**else {
                swal("El Usuario NO se ha eliminado!");
            }**/
        });
}

function userDelete(id) {
    swal({
        title: "Esta seguro de Eliminar el usuario?",
        text: "Una vez eliminado el usuario no puede ser recuperado!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/usuario/eliminar/"+id,
                    success: function(res){
                        console.log(res);
                    }
                });
                swal("Poof! el Usuario ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/usuario/listar";
                    }
                });
            } else {
                swal("El Usuario NO se ha eliminado!");
            }
        });
}

function clientDelete(id) {
    swal({
        title: "Esta seguro de Eliminar este cliente?",
        text: "Una vez eliminado este cliente no puede ser recuperado!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/cliente/eliminar/"+id,
                    success: function(res){
                        console.log(res);
                    }
                });
                swal("Poof! este cliente ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/cliente/listar";
                    }
                });
            } else {
                swal("Este cliente NO se ha eliminado!");
            }
        });
}

function productDelete(id) {
    swal({
        title: "Esta seguro de Eliminar este producto?",
        text: "Una vez eliminado este producto no puede ser recuperado!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/producto/eliminar/"+id,
                    success: function(res){
                        console.log(res);
                    }
                });
                swal("Poof! este producto ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/producto/listar";
                    }
                });
            } else {
                swal("Este producto NO se ha eliminado!");
            }
        });
}

function providerDelete(id) {
    swal({
        title: "Esta seguro de Eliminar este proveedor?",
        text: "Una vez eliminado este registro no puede ser recuperado!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/proveedor/eliminar/"+id,
                    success: function(res){
                        console.log(res);
                    }
                });
                swal("Poof! este proveedor ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/proveedor/listar";
                    }
                });
            } else {
                swal("Este proveedor NO se ha eliminado!");
            }
        });
}