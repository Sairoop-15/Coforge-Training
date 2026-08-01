import React, { useState } from "react";

function StudentRegistration() {

    const [name, setName] = useState("");
    const [age, setAge] = useState("");
    const [gender, setGender] = useState("");
    const [course, setCourse] = useState("");
    const [city, setCity] = useState("");


    return (
        <>
            <h2>Student Registration</h2>

            Name :
            <input
                type="text"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />
            <br /><br />

            Age :
            <input
                type="number"
                value={age}
                onChange={(e) => setAge(e.target.value)}
            />
            <br /><br />

            Gender :
            <input
                type="text"
                value={gender}
                onChange={(e) => setGender(e.target.value)}
            />
            <br /><br />

            Course :
            <input
                type="text"
                value={course}
                onChange={(e) => setCourse(e.target.value)}
            />
            <br /><br />

            City :
            <input
                type="text"
                value={city}
                onChange={(e) => setCity(e.target.value)}
            />
            <br /><br />

            <button >
                Submit
            </button>

            {(
                <>
                    <h3>Student Details</h3>

                    <p>Name : {name}</p>
                    <p>Age : {age}</p>
                    <p>Gender : {gender}</p>
                    <p>Course : {course}</p>
                    <p>City : {city}</p>
                </>
            )}
        </>
    );
}

export default StudentRegistration;