/* Única funcionalidad propia compartida: alternar y recordar el tema visual. */
(() => {
  const storageKey = "nova-market-theme";
  const validThemes = ["light", "dark"];

  let savedTheme = "light";
  try {
    const storedTheme = localStorage.getItem(storageKey);
    if (validThemes.includes(storedTheme)) {
      savedTheme = storedTheme;
    }
  } catch (error) {
    // Si el navegador bloquea localStorage, la página conserva el tema claro.
  }

  document.documentElement.setAttribute("data-bs-theme", savedTheme);

  document.addEventListener("DOMContentLoaded", () => {
    const toggleButton = document.getElementById("themeToggle");
    const themeIcon = document.getElementById("themeIcon");
    const themeLabel = document.getElementById("themeLabel");

    if (!toggleButton) return;

    const renderThemeButton = (theme) => {
      const isDark = theme === "dark";
      if (themeIcon) themeIcon.textContent = isDark ? "☀" : "☾";
      if (themeLabel) themeLabel.textContent = isDark ? "Tema claro" : "Tema oscuro";
      toggleButton.setAttribute(
        "aria-label",
        isDark ? "Cambiar a tema claro" : "Cambiar a tema oscuro"
      );
    };

    renderThemeButton(savedTheme);

    toggleButton.addEventListener("click", () => {
      const currentTheme = document.documentElement.getAttribute("data-bs-theme");
      const nextTheme = currentTheme === "dark" ? "light" : "dark";

      document.documentElement.setAttribute("data-bs-theme", nextTheme);
      renderThemeButton(nextTheme);

      try {
        localStorage.setItem(storageKey, nextTheme);
      } catch (error) {
        // El cambio visual funciona aunque el navegador no permita guardar.
      }
    });
  });
})();
