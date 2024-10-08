// controllers/authController.js
exports.login = (req, res) => {
    const { email, password } = req.body;

    // Remplacez par votre logique de validation
    if (email === 'test@example.com' && password === 'password') {
        res.send('Connexion réussie');
    } else {
        res.status(401).json({ message: 'Informations de connexion incorrectes' });
    }
};

exports.register = (req, res) => {
    // Logique pour l'inscription
};
