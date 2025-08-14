const form = document.getElementById('rtoForm');
const progressBar = document.getElementById('formProgress');
form.addEventListener('input', () => {
  const inputs = form.querySelectorAll('input, select, textarea');
  let filled = 0;
  inputs.forEach(input => {
    if ((input.type === 'checkbox' && input.checked) || (input.value && input.value.trim() !== '')) {
      filled++;
    }
  });
  const progress = Math.round((filled / inputs.length) * 100);
  progressBar.style.width = progress + '%';
  progressBar.textContent = progress + '%';
});
form.addEventListener('submit', e => {
  e.preventDefault();
  if (!form.checkValidity()) {
    form.classList.add('was-validated');
  } else {
    alert('Form submitted successfully!');
    form.reset();
    progressBar.style.width = '0%';
    progressBar.textContent = '0%';
  }
});
