import React, { useState } from "react";

function LoginForm() {

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");

    const login = () => {

        let valid = true;

        if (email === "") {
            setEmailError("Email should not be empty");
            valid = false;
        } else {
            setEmailError("");
        }

        if (password.length < 6) {
            setPasswordError("Password should contain minimum 6 characters");
            valid = false;
        } else {
            setPasswordError("");
        }

        if (valid) {
            alert("Login Successful");
        }
    };

    return (
        <>
            <h2>Login Form</h2>

            Email :
            <input
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />
            <br />
            <span>{emailError}</span>

            <br /><br />

            Password :
            <input
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />
            <br />
            <span>{passwordError}</span>

            <br /><br />

            <button onClick={login}>
                Login
            </button>
        </>
    );
}

export default LoginForm;