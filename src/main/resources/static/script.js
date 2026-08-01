const API = "http://localhost:8080/movies";

// Load all movies when the page opens
window.onload = loadMovies;

// Show all movies
function loadMovies() {
    fetch(API)
        .then(response => response.json())
        .then(data => displayMovies(data))
        .catch(error => console.error(error));
}

// Search by title first, then by genre
function searchMovies() {

    const search = document.getElementById("genre").value.trim();

    if (search === "") {
        loadMovies();
        return;
    }

    fetch(API + "/title/" + encodeURIComponent(search))
        .then(response => response.json())
        .then(data => {

            if (data.length > 0) {
                displayMovies(data);
            } else {

                fetch(API + "/genre/" + encodeURIComponent(search))
                    .then(response => response.json())
                    .then(data => displayMovies(data))
                    .catch(error => console.error(error));

            }

        })
        .catch(error => console.error(error));
}

// Display Movies
function displayMovies(movies) {

    const container = document.getElementById("movies");
    container.innerHTML = "";

    if (movies.length === 0) {
        container.innerHTML = "<h2>No Movies Found</h2>";
        return;
    }

    movies.forEach(movie => {

        container.innerHTML += `
        <div class="movie-card">

            <img
                class="poster"
                src="/images/${movie.title}.jpg"
                alt="${movie.title}"
                onerror="this.src='/images/default.jpg'">

            <h2>${movie.title}</h2>

            <p><b>Genre:</b> ${movie.genre}</p>

            <p><b>⭐ Rating:</b> ${movie.rating}</p>

            <p><b>Release Year:</b> ${movie.releaseYear}</p>

            <p><b>Language:</b> ${movie.language}</p>

            <p>${movie.description}</p>

        </div>
        `;
    });

}