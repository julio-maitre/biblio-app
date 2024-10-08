document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');

    if (loginForm) {
        loginForm.addEventListener('submit', function(event) {
            event.preventDefault();

            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;

            login(username, password)
                .then(data => {
                    if (data.success) {
                        window.location.href = '/dashboard'; // Redirige après connexion réussie
                    } else {
                        alert('Nom d’utilisateur ou mot de passe incorrect.');
                    }
                })
                .catch(error => {
                    alert('Erreur lors de la connexion.');
                });
        });
    }
});
