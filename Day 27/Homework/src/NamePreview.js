import React, { useState } from "react";

function NamePreview() {

    const [name, setName] = useState("");

    return (
        <>
            <h2>Live Name Preview</h2>

            <input
                type="text"
                placeholder="Enter Name"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />

            <h3>
                Welcome {name}
            </h3>
        </>
    );
}

export default NamePreview;