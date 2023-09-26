$(document).ready(function () {
    $("#sidebar-toggle").click(function () {
        const sidebar = $("#sidebar");
        const content = $(".content");
        const sidebarText = $(".sidebar-text");

        if (sidebar.width() == 60) {
            sidebar.animate({ width: '250px' }, 300);
            content.animate({ marginLeft: '250px' }, 300);
            sidebarText.fadeIn(300);
        } else {
            sidebar.animate({ width: '60px' }, 300);
            content.animate({ marginLeft: '80px' }, 300);
            sidebarText.fadeOut(300);
        }
    }
 
    );
    });
